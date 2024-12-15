# !pip install stable-baselines3
# !pip install gym[all]
# !pip install ale-py
# !pip install pyglet
# !pip install gym[accept-rom-license]

# import gym
# import stable_baselines3
# from ale_py import ALEInterface

# ale = ALEInterface()

# env = gym.make("ALE/Tennis-v5") #{state, reward, dones, _, infos}


import gym

from stable_baselines3 import DQN

env = gym.make("CartPole-v1")

model = DQN("MlpPolicy", env, verbose=1, buffer_size=10000)
model.learn(total_timesteps=10000000, log_interval=1)
model.save("./dqn_pong")

del model # remove to demonstrate saving and loading

model = DQN.load("dqn_pong")

obs = env.reset()
while True:
    action, _states = model.predict(obs, deterministic=True)
    obs, reward, done, info = env.step(action)
    env.render()
    if done:
      obs = env.reset()
