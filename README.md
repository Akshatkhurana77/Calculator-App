<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator App</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
            background-color: #f9f9f9;
            color: #333;
        }
        h1, h2, h3 {
            color: #ff9800;
        }
        pre {
            background-color: #eee;
            padding: 10px;
            border-radius: 5px;
        }
        .code {
            font-family: 'Courier New', Courier, monospace;
            color: #d14;
        }
        a {
            color: #ff9800;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
        ul {
            margin: 10px 0;
            padding-left: 20px;
        }
    </style>
</head>
<body>

<h1>Calculator App</h1>

<h2>Description</h2>
<p>The Calculator App is a simple Android application designed to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. It provides a user-friendly interface with a responsive layout, supporting continuous calculations and real-time results display.</p>

<h2>Features</h2>
<ul>
    <li>Perform basic arithmetic operations: <span class="code">+</span>, <span class="code">-</span>, <span class="code">*</span>, <span class="code">/</span>.</li>
    <li>Supports continuous calculations by chaining operations.</li>
    <li>Clear functionality to reset the calculator.</li>
    <li>Real-time display of input, operations, and results.</li>
    <li>Interactive UI with visually appealing orange button shades.</li>
</ul>

<h2>Screenshots</h2>
<p><em>Add screenshots of your app here (optional)</em></p>

<h2>Technologies Used</h2>
<ul>
    <li><strong>Language:</strong> Java</li>
    <li><strong>IDE:</strong> Android Studio</li>
    <li><strong>UI:</strong> XML Layouts</li>
</ul>

<h2>How to Use</h2>
<ol>
    <li>Launch the app on your Android device.</li>
    <li>Input numbers using the numeric buttons.</li>
    <li>Select an operator (e.g., <span class="code">+</span>, <span class="code">-</span>, <span class="code">*</span>, <span class="code">/</span>).</li>
    <li>Input another number and press <span class="code">=</span> to get the result.</li>
    <li>Press <span class="code">C</span> to clear the display and reset the calculator.</li>
</ol>

<h2>File Structure</h2>
<ul>
    <li><strong>MainActivity.java:</strong> Contains the logic for handling user input and performing calculations.</li>
    <li><strong>activity_main.xml:</strong> Defines the UI layout of the calculator.</li>
    <li><strong>colors.xml:</strong> Contains the color definitions for the app, including orange shades.</li>
    <li><strong>styles.xml:</strong> Defines reusable styles for buttons and other UI elements.</li>
    <li><strong>button_selector.xml:</strong> Drawable resource to manage button state changes (normal and pressed).</li>
</ul>

<h2>Future Enhancements</h2>
<ul>
    <li>Add support for advanced operations like square root, percentage, and exponentiation.</li>
    <li>Implement memory functions (MC, MR, M+, M-).</li>
    <li>Include themes for light and dark modes.</li>
</ul>
</body>
</html>
