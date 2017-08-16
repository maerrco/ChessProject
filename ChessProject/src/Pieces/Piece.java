/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pieces;
import Game.*;
/**
 *
 * @author bdg7335
 */
public abstract class Piece {
    public int x, y;
    public Player player;
    
    
    public Piece(int x, int y, Player player) {
        this.x = x;
        this.y = y;
        this.player = player;
    }
    
    public abstract boolean isValidPath (int finalX, int finalY) {
        /**
         * check that the final X and Y parameters are valid from the start x and y coordinates
         */
    }
    
    public abstract int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        /**
         * draws a straight line from the start to end point to show movement
         */
    }
    
    public abstract char getType() {
        /**
         * gets the type of chessPiece character that indicates the piece 
         */
    }
}
