package com.company;

/*
Name: Samson Tsegai, UR ID: 31810609
Name: Kestor Brown, UR ID:
 */

import java.util.Scanner;

public class Skyscraper {
    private int DIM;
    private int i;
    private int j;
    private int[][] puzzle;
    private boolean placement;
    private int[] score;
    Scanner sc = new Scanner(System.in);

    public boolean verifyPlacement() {
        for (i = 0; i < puzzle.length; i++) {
            for (j = 0; j < puzzle.length; j++) {
                if (puzzle[i][i] != puzzle[i][j] || puzzle[i][i] != puzzle[j][i]) {
                    placement = true;
                } else {
                    placement = false;
                }
            }
        }
        return placement;
    }

    public void loadPuzzle() {
        DIM = sc.nextInt();
        puzzle = new int[DIM][DIM];
        for (i = 0; i < puzzle.length; i++) {
            for (j = i + 1; j < puzzle.length; j++) {
                puzzle[i][j] = sc.nextInt();
            }
        }
    }

    public void print() {
        System.out.println();
        for (i = 0; i < puzzle.length; i++) {
            for (j = i + 1; j < puzzle.length; j++) {
                System.out.print(puzzle[i][j]);
                if (i != puzzle.length - 1 && j != puzzle.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printWithVisibility() {
        score = new int[puzzle.length];
        for (i = 0; i < puzzle.length; ++i) {
            for (j = 0; j < puzzle.length; ++j) {
            }
        }
        while (i < puzzle.length + 1) {
            System.out.print("_");
        }
        for (i = 0; i < puzzle.length; i++) {
            System.out.print();
        }
    }

    public static void main(String[] args) {
        Skyscraper sky = new Skyscraper();
        sky.loadPuzzle();
        sky.print();

        /*if (sky.verifyPlacement()) {
            System.out.println();
            System.out.println("Validity confirmed. Processing . . .");
            sky.printWithVisibility();
        } else {
            System.out.println();
            System.out.println("Input is not valid. Have a блять day.");
        }
         */
    }
}
