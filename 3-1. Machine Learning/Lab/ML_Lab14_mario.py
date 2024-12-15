import gym_super_mario_bros
from gym_super_mario_bros.actions import SIMPLE_MOVEMENT
from stable_baselines3 import DQN
from stable_baselines3.common.vec_env import DummyVecEnv

# List of all World 8 stages
def make_env(stage):
    def _init():
        env = gym_super_mario_bros.make(f"SuperMarioBros-8-{stage}-v3")
        return env
    return _init

env_list = [make_env(stage) for stage in range(1, 5)]

env = DummyVecEnv(env_list)

movement = SIMPLE_MOVEMENT

model = DQN("MlpPolicy", env, verbose=1, buffer_size=10000, learning_rate=1e-4)

model.learn(total_timesteps=1000000, log_interval=10)
model.save("./dqn_super_mario_world8")

del model

model = DQN.load("dqn_super_mario_world8")

for stage in range(1, 5):
    print(f"Playing Stage 8-{stage}")
    env = gym_super_mario_bros.make(f"SuperMarioBros-8-{stage}-v0")
    obs = env.reset()
    if isinstance(obs, tuple):
        obs = obs[0]
    while True:
        action, _states = model.predict(obs, deterministic=True)
        obs, reward, done, info = env.step(action)
        env.render()
        if done:
            obs = env.reset()
            if isinstance(obs, tuple):
                obs = obs[0]
            break
