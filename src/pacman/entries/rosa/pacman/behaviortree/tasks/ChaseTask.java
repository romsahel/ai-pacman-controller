package pacman.entries.rosa.pacman.behaviortree.tasks;

import pacman.entries.rosa.pacman.behaviortree.MyPacMan;
import pacman.entries.rosa.pacman.behaviortree.helpers.Leaf;
import pacman.game.Constants;
import pacman.game.Game;

/**
 * Action task: sets the next move to chase the nearest ghost
 * @author romsahel
 */
public class ChaseTask extends Leaf
{

    public ChaseTask(MyPacMan parent)
    {
        super(parent);
    }

    @Override
    public boolean DoAction(Game game)
    {
        parent.setMove(game.getNextMoveTowardsTarget(
                state.getCurrent(),
                state.getNearestGhost().getIndex(),
                Constants.DM.PATH)
        );
        return true;
    }

}
