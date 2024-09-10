window.onload = function() {
    const canvas = document.getElementById('myCanvas');
    const ctx = canvas.getContext('2d');
  
    // Draw the blue background
    ctx.fillStyle = '#0000ff';
    ctx.fillRect(0, 0, canvas.width, canvas.height);
  
    // Draw the yellow circle
    ctx.beginPath();
    ctx.arc(50, 50, 40, 0, 2 * Math.PI);
    ctx.fillStyle = '#ffff00';
    ctx.fill();
  
    // Draw the white triangle
    ctx.beginPath();
    ctx.moveTo(200, 150);
    ctx.lineTo(300, 150);
    ctx.lineTo(250, 50);
    ctx.closePath();
    ctx.fillStyle = '#000000';
    ctx.fill();
  
    // Draw the white circle
    ctx.beginPath();
    ctx.arc(350, 50, 40, 0, 2 * Math.PI);
    ctx.fillStyle = '#ffffff';
    ctx.fill();
  
    // Draw the green rectangle
    ctx.fillStyle = '#008000';
    ctx.fillRect(0, 150, canvas.width, 50);
  
    // Draw the key icon
    ctx.beginPath();
    ctx.moveTo(375, 175);
    ctx.lineTo(375, 190);
    ctx.bezierCurveTo(370, 185, 365, 185, 360, 190);
    ctx.lineTo(360, 175);
    ctx.fillStyle = '#000000';
    ctx.fill();

    // Draw the black circle on top of the key icon
    ctx.beginPath();
    ctx.arc(367, 171, 6, 0, 2 * Math.PI);
    ctx.fillStyle = '#000000';
    ctx.fill();
  };