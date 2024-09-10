import time

def traffic_light_algorithm():
    while True:
        # Red phase
        print("Red light")
        time.sleep(10)  # Assume 10 seconds for red light

        # Yellow phase
        print("Yellow light")
        time.sleep(3)   # Assume 3 seconds for yellow light

        # Green phase
        print("Green light")
        time.sleep(15)  # Assume 15 seconds for green light

if __name__ == "__main__":
    traffic_light_algorithm()
