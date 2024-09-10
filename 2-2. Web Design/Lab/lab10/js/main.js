const canvas = document.getElementById('gameCanvas');
const ctx = canvas.getContext('2d');

let bubbles = [];
let score = 0;
let currentTurn = 1;
let gameActive = true;

class Bubble {
    constructor(x, y, radius, color, dx, dy) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
        this.dx = dx; // direction x
        this.dy = dy; // direction y
    }

    draw() {
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.radius, 0, Math.PI * 2, false);
        ctx.fillStyle = this.color;
        ctx.fill();
        ctx.closePath();
    }

    update() {
        this.x += this.dx;
        this.y += this.dy;

        // Check for wall collisions
        if (this.x + this.radius > canvas.width || this.x - this.radius < 0) {
            this.dx = -this.dx;
        }
        if (this.y + this.radius > canvas.height || this.y - this.radius < 0) {
            this.dy = -this.dy;
        }

        this.draw();
    }
}

function setupBubbles() {
    for (let i = 0; i < currentTurn + 3; i++) {
        let radius = 20; // Static size for simplicity
        let x = Math.random() * (canvas.width - radius * 2) + radius;
        let y = Math.random() * (canvas.height - radius * 2) + radius;
        let color = `rgb(${Math.floor(Math.random() * 256)}, ${Math.floor(Math.random() * 256)}, ${Math.floor(Math.random() * 256)})`;
        let dx = (Math.random() - 0.5) * 4;
        let dy = (Math.random() - 0.5) * 4;
        bubbles.push(new Bubble(x, y, radius, color, dx, dy));
    }
}

function draw() {
    if (!gameActive) return;

    ctx.clearRect(0, 0, canvas.width, canvas.height);
    bubbles.forEach(bubble => bubble.update());
    if (bubbles.length === 0) {
        alert('Next round!');
        currentTurn++;
        setupBubbles();
    }
}

function initGame() {
    setupBubbles();
    setInterval(draw, 10);
}

canvas.addEventListener('click', function(event) {
    const rect = canvas.getBoundingClientRect();
    const x = event.clientX - rect.left;
    const y = event.clientY - rect.top;

    bubbles = bubbles.filter(bubble => {
        const distance = Math.sqrt((x - bubble.x) ** 2 + (y - bubble.y) ** 2);
        if (distance < bubble.radius) {
            score += 1;
            return false; // Bubble pops
        }
        return true;
    });
});

initGame();
