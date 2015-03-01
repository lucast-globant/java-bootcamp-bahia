package topic1.audioplayer;

public class StateContext {

	private StateStrategy strategy;
	
	public StateContext (StateStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void executeAction (AudioPlayer player) {
		strategy.executeAction(player);
	}
}
