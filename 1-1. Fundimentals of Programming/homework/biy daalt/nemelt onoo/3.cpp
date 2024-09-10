#include <iostream>
#include <string>

using namespace std;

const int MAX_X = 10; // Maximum x coordinate of the grid
const int MAX_Y = 10; // Maximum y coordinate of the grid

// Function prototypes
void drawGrid(int playerX, int playerY, int enemy1X, int enemy1Y, int enemy2X, int enemy2Y, int enemy3X, int enemy3Y);
void movePlayer(int &playerX, int &playerY);
void moveEnemies(int &enemy1X, int &enemy1Y, int &enemy2X, int &enemy2Y, int &enemy3X, int &enemy3Y);
bool checkCollision(int playerX, int playerY, int enemy1X, int enemy1Y, int enemy2X, int enemy2Y, int enemy3X, int enemy3Y);

int main()
{
    int playerX = MAX_X / 2; // Initial x coordinate of the player
    int playerY = MAX_Y / 2; // Initial y coordinate of the player
    int enemy1X = 0; // Initial x coordinate of the first enemy
    int enemy1Y = 0; // Initial y coordinate of the first enemy
    int enemy2X = MAX_X - 1; // Initial x coordinate of the second enemy
    int enemy2Y = 0; // Initial y coordinate of the second enemy
    int enemy3X = 0; // Initial x coordinate of the third enemy
    int enemy3Y = MAX_Y - 1; // Initial y coordinate of the third enemy
    
    cout << "Welcome to Plane Shooting!" << endl;
    cout << "Use the arrow keys to move and avoid the enemy planes." << endl;
    cout << "Press 'q' to quit the game." << endl;
    
    while (true)
    {
        drawGrid(playerX, playerY, enemy1X, enemy1Y, enemy2X, enemy2Y, enemy3X, enemy3Y);
        movePlayer(playerX, playerY);
        moveEnemies(enemy1X, enemy1Y, enemy2X, enemy2Y, enemy3X, enemy3Y);
        if (checkCollision(playerX, playerY, enemy1X, enemy1Y, enemy2X, enemy2Y, enemy3X, enemy3Y))
        {
            cout << "Game Over!" << endl;
            break;
        }
    }
    
    return 0;
}

// This function draws the grid on the screen
void drawGrid(int playerX, int playerY, int enemy1X, int enemy1Y, int enemy2X, int enemy2Y, int enemy3X, int enemy3Y)
{
    for (int y = 0; y < MAX_Y; y++)
    {
        for (int x = 0; x < MAX_X; x++)
        {
            if (x == playerX && y == playerY)
            {
                cout << "P"; // The player is represented by a 'P'
            }
            else if (x == enemy1X && y == enemy1Y)
            {
                cout << "1"; // The first enemy is represented by a '1'
            }
            else

// This function moves the player according to the input from the keyboard
void movePlayer(int &playerX, int &playerY)
{
    if (kbhit()) // kbhit is a function that returns true if a key is pressed
    {
        char ch = getch(); // getch is a function that returns the character of the key pressed
        if (ch == 'q')
        {
            exit(0); // Quit the game
        }
        else if (ch == 'w')
        {
            playerY--; // Move up
        }
        else if (ch == 's')
        {
            playerY++; // Move down
        }
        else if (ch == 'a')
        {
            playerX--; // Move left
        }
        else if (ch == 'd')
        {
            playerX++; // Move right
        }
    }
    
    // Make sure the player stays within the bounds of the grid
    playerX = max(0, min(playerX, MAX_X - 1));
    playerY = max(0, min(playerY, MAX_Y - 1));
}

// This function moves the enemies
void moveEnemies(int &enemy1X, int &enemy1Y, int &enemy2X, int &enemy2Y, int &enemy3X, int &enemy3Y)
{
    // Move the first enemy
    enemy1X++;
    if (enemy1X >= MAX_X)
    {
        enemy1X = 0;
    }
    
    // Move the second enemy
    enemy2Y++;
    if (enemy2Y >= MAX_Y)
    {
        enemy2Y = 0;
    }
    
    // Move the third enemy
    enemy3X--;
    if (enemy3X < 0)
    {
        enemy3X = MAX_X - 1;
    }
}

// This function checks if there is a collision between the player and an enemy
bool checkCollision(int playerX, int playerY, int enemy1X, int enemy1Y, int enemy2X, int enemy2Y, int enemy3X, int enemy3Y)
{
    return (playerX == enemy1X && playerY == enemy1Y) || (playerX == enemy2X && playerY == enemy2Y) || (playerX == enemy3X && playerY == enemy3Y);
}

