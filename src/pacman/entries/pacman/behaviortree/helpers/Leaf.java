package pacman.entries.pacman.behaviortree.helpers;

import pacman.entries.pacman.behaviortree.MyPacMan;

/**
 *
 * @author romsahel
 */
public abstract class Leaf extends Task
{
    protected final MyPacMan parent;

    public Leaf(MyPacMan parent)
    {
        this.parent = parent;
    }

}