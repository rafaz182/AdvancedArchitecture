# AdvancedArchitecture

#### Video 01
* Install dependencies;
* Create AppModule class;
  * Create a application context provider;
* Create AppComponent interface;
  * Configure @Singleton scope;
  * Add the AppModule in this component;
* Build the project to Dagger2 make their implementation
* Create a attribute of AppComponent in App class
* In the method onCreate, pass the generated implementation to that attribute

#### Video 02
* Create ActivityScope annotation
    * Mark it with @Scope annotation and set the retention policy to RUNTIME
* Create MainActivityComponent interface and extend this with AndroidInjector<MainActivity>
    * Mark it with @ActivityScope and with @Subcomponent
    * Create an inner abstract class called Builder
        * Annotate with @Subcomponent.Builder
        * Extend AndroidInjector.Builder<MainActivity>
* Create an abstract class called ActivityBindingModule
    * Annotate with @Module
    * Add the sub component MainActivityComponent to it
    * Create an abstract provider called provideMainActivityInjector(MainActivityComponent.Builder)
    that return an AndroidInjector.Factory<? extends Activity>
        * Annotate with @Binds, @IntoMap and @ActivityKey(MainActivity.class)