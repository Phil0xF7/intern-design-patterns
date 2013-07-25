<html>
<body>
<h1>Design Pattern: Observer</h1>

<ul>
	<li>"a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically"</li>
	<li>Flexible</li>
	<li>Limited interdependence between observers and object</li>
	<li>Cannot depend on notifying Observers in a specific order -- if this were the case, this would no longer be considered loosely coupled</li>
</ul>
<br>
What this program does is model the Observer design pattern as seen by the perspective of a newspaper. Obviously papars are dependent on subscribers, and they want their subscribers to know when there's new material for them to read. If the material isn't up to snuff, the subscribers are probably going to leave. But if it's good, maybe they'll tell their friends about you, and they'll add to your subscription base! Yay!!


<h3>java.util.Observable()</h3>
<ul>
	<li>
		void addObserver(Observer o)
		<ul>
			<li>
				Adds an observer to the set of observers for this object, provided that it is not the same as some observer already in the set.
			</li>
		</ul>
	</li>
	<li>
		protected void clearChanged()
		<ul>
			<li>
				Indicates that this object has no longer changed, or that it has already notified all of its observers of its most recent change, so that the hasChanged method will now return false.
			</li>
		</ul>
	</li>
	<li>
		int countObservers()
			<ul>
				<li>
					Returns the number of observers of this Observable object.
				</li>
			</ul>
	</li>
	<li>
		void deleteObserver(Observer o)
			<ul>
				<li>
					Deletes an observer from the set of observers of this object.
				</li>
			</ul>
	</li>
	<li>
		void deleteObservers()
		<ul>
			<li>
				Clears the observer list so that this object no longer has any observers.
			</li>
		</ul>
	</li>
	<li>
		boolean hasChanged()
			<ul>
				<li>
					Tests if this object has changed.
				</li>
			</ul>
	</li>
	<li>
		void notifyObservers()
			<ul>
				<li>
					If this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed.
				</li>
			</ul>
	</li>
	<li>
		void notifyObservers(Object args)
			<ul>
				<li>
					If this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed.
				</li>
			</ul>
	</li>
	<li>
		protected void setChanged()
		<ul>
			<li>
				Marks this Observable object as having been changed; the hasChanged method will now return true.
			</li>
		</ul>
</li>
</ul>

<h3>Resources</h3>
http://docs.oracle.com/javase/6/docs/api/java/util/Observable.html<br>
http://www.dreamincode.net/forums/topic/252769-design-patterns-observer-pattern<br>
http://en.wikipedia.org/wiki/Observer_pattern<br>
</body>
</html>
