/* Publisher */

package edu.bu.met.cs665.observable;

import edu.bu.met.cs665.observer.StoreOrderDeliveryObserver;

/** This interface specifies a simple Observable or Subject in Observer Pattern. */
public interface StoreOrderDeliverySubject {

  /**
   * Register an observer to list of observers.
   *
   * @param o the observer object
   */
  public void registerObserver(StoreOrderDeliveryObserver o);

  /**
   * Remove an observer from observer list.
   *
   * @param o the observer object
   */
  public void removeObserver(StoreOrderDeliveryObserver o);

  /** Notify all observers. */
  public void notifyObservers();
}
