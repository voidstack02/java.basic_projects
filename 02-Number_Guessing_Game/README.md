# Number Guessing Game

A console-based number guessing game built using Java.

The player selects a difficulty level and tries to guess a randomly generated number within the given range and number of attempts.

## Features

- Three difficulty levels
- Random number generation
- Limited attempts based on difficulty
- Too High / Too Low hints
- Attempt counter
- Win and Game Over conditions

## Difficulty Levels

| Difficulty | Number Range | Attempts |
|---|---:|---:|
| Easy | 1–40 | 10 |
| Medium | 1–70 | 7 |
| Hard | 1–120 | 5 |

## Concepts Used

- Variables
- Data Types
- Scanner
- Random
- If-Else Statements
- Switch Statement
- While Loop
- Comparison Operators
- Logical Operators

## Example

```text
===== NUMBER GUESSING GAME =====

Select Difficulty:

1 = EASY
2 = MEDIUM
3 = HARD

Enter your choice: 2

Difficulty -> MEDIUM

Enter your guess: 30
TOO LOW!

Enter your guess: 60
TOO HIGH!

Enter your guess: 47
CORRECT!

You guessed the number in 3 attempts.
