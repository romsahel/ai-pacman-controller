/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.entries.pacman.behaviortree.helpers;

import pacman.game.Game;

/**
 *
 * @author romsahel
 */
public class Selector extends Composite
{

    @Override
    public boolean DoAction(Game game)
    {
        System.out.println("Selector");
        for (Task child : children)
        {
            if (child.DoAction(game))
                return true;
        }
        System.out.println("false");

        return false;
    }

}
