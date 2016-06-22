# IGT_Test
Interview Code test

### Summary

This code showcases a simple implementation of the Model-View-Presenter pattern with no architectural
frameworks. It uses manual dependency injection to provide a repository with
local and remote data sources. Asynchronous tasks are handled with callbacks.

<img src="https://github.com/googlesamples/android-architecture/wiki/images/mvp.png" alt="Diagram"/>

Note: in a MVP context, the term "view" is overloaded:

  * The class android.view.View will be referred to as "Android View"
  * The view that receives commands from a presenter in MVP, will be simply called
"view".

### Fragments

It uses fragments for two reasons:

  * The separation between Activity and Fragment fits nicely with this
implementation of MVP: the Activity is the overall controller that creates and
connects views and presenters.
  * Tablet layout or screens with multiple views take advantage of the Fragments
framework.
#Features
<b>Complexity - understandability</b>
Use of architectural frameworks/libraries/tools:</br>
1 Retrofit 2</br>
2 Dagger 2</br>
3 RxJava </br>
4 MVP design pattern</br>

<b>None</b>
Conceptual complexity </br>
Low, as it's a pure MVP implementation for Android</br>

<b>Testability</b></br>
Unit testing

High, presenters are unit tested as well as repositories and data sources.

<b>UI testing</b></br>

High, injection of fake modules allow for testing with fake data


<b>Maintainability</b>
Ease of amending or adding a feature

High.
Learning cost

Low. Features are easy to find and the responsibilities are clear. Developers don't need to be familiar with any external dependency to work on the project.
