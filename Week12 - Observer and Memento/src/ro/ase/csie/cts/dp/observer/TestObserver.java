package ro.ase.csie.cts.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		
		//we need observable
		NetworkMonitorModule monitor = new NetworkMonitorModule();
		
		monitor.networkStatusChanged(NetworkStatus.UP);
		
		NetworkStatusHandlerInterface autosave = new AutoSaveModule();
		NetworkStatusHandlerInterface notifications = new UINotificationsModule();
		
		monitor.register(autosave);
		monitor.register(notifications);
		
		monitor.networkStatusChanged(NetworkStatus.DOWN);
		
		monitor.unregister(notifications);
		
		monitor.networkStatusChanged(NetworkStatus.UP);
		
	}

}
