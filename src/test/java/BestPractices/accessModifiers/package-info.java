package BestPractices.accessModifiers;

/*
    Access Modifiers :  public, protected, private and default

    Def :
        public      :    available everywhere
        protected   :   availble in the class in the same package OR by sub class instantiation if outside the package ( sub class that inherits )
        private     :   available within the class
        default     :   by class in same package

    Applicability :
        Class

    Notes :
        -   Use private for attributes unless there is a good reason not to do so.
            -- ( it does not save memory : https://stackoverflow.com/questions/31010946/in-java-memory-wise-does-it-make-a-difference-to-use-private-vs-public )
        -   Use public for constants ( so that they can be accessed everywhere )
        -   Use protected if you want class members to be accessed by subclass OR by classes in the same package only. Not from outside.
        -   Use private if you think the method will be accessed only within the given class but should not be acccessed from outside.
        -   Private
 */