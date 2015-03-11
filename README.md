# Playing-with-Enums
Creating instances and calling methods over Enums

it uses gson for converting json to java.

it is not an API so don't use any classes, it won't do you any good. but you can copy any parts of code you wish.

how it works:

top level: an Interface for Classes, Interface for ActionEnums and ItemFabricEnum, that delegates insance creating to midle level.

midle level: each midle level branch has its own package, an abstract class, that implements all methods, you want to use, TypeActionEnum and TypeFabricEnum.

low level: contains only leaf classes.

this application reads .txt file in PrototypeHolder with gson. PrototypeHolder has a list of Prototypes, wich we can run trough with "for". 

each Prototype has field type1 wich represents midle level branch and can be used in .valueOf(p.typ1); each of its values has a methode instance() in wich it calls corresponding midle level FabricEnum. each value of those enums contains a instance() method, that calls constructor, and wich of values is used, determinates field typ2 in Prototype. 

now to actions: every Prototype has a List of Strings. each represents one availiable action. instance methode runs through this list and adds ActionEnums values to new instance. and the list of those ActionEnum Values is what Item interface can get from each Class, that implements it. and calling .doIt() method on values of this Enum will call corresponding method for this class.

so now we have an instance and a list of actions for it. it can now be given to a context menu, drop-down field, AI...
