 
## Identification: 
 The pattern can be recognized if you see a subscription method that stores incoming objects in a list. You can confirm the identification, if you see some sort of notification method that iterates over objects in that list and calls their “update” method.

## Event Subscription:
 In this example, the observer pattern establishes indirect collaboration between objects of a text editor. Each time the object changes, it notifies it's subscribers. EmailNotificationListener and LogOpenListener react to these notifications by executing their primary behaviors.
 Subscriber class aren't coupled to the editor class and can be reused in other apps if needed. The Editor class depends only on the abstract subscriber interface. This allows adding new subscriber types without changing the editor's code.