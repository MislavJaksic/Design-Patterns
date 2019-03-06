package observer.observable_subject;

import observer.observer.Observer;

public interface ObservableSubject {
	public void AddObserver(Observer observer);
	public void RemoveObserver(Observer observer);
	public void NotifyObservers();
}
