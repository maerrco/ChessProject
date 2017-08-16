/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;

/**
 *
 * @author bdg7335
 */
public class Player {
    public Color playerColor;
    public boolean isWinner = false;
    public Game currentGame;
    
    public Player(Color playerColor) {
        this.playerColor = playerColor;
    }
    
    
    
}
