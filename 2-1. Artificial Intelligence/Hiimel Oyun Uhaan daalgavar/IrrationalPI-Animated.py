import numpy as np
import matplotlib.pyplot as plt
from matplotlib.animation import FuncAnimation

# Create an array of theta values in degrees (e.g., from 0 to 113*360)
theta_degrees = np.linspace(0, 113*360, 10000)

# Convert degrees to radians
theta_radians = np.deg2rad(theta_degrees)

# Function to update the plot for each frame
def update(frame):
    plt.clf()  # Clear the current figure
    z = np.exp(theta_radians[:frame] * 1j) + np.exp(np.pi * theta_radians[:frame] * 1j)
    x = np.real(z)
    y = np.imag(z)
    plt.plot(x, y, color='white', linewidth=0.5)
    plt.gca().set_facecolor('black')
    plt.gca().set_aspect('equal')
    plt.grid(False)
    plt.xlim(-2.5, 2.5)
    plt.ylim(-2.5, 2.5)

# Create the animation
ani = FuncAnimation(plt.gcf(), update, frames=len(theta_degrees), repeat=False, interval=10)

# Display the animation
plt.show()
