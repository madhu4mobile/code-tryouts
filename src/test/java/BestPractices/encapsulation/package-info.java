package BestPractices.encapsulation;

    /*
        Encapsulation :
            Wapping up of a data under a single unit! The data is protected.

         How is it protected?
            - By making class attributes ( or varaibles ) private
            - By making methods as private

         How to access the attributes that are private?
            - we have to use getter and setter methods to access private attributes.

         Advantages :
            -   Data hiding
            -   Flexibility to use variables as read-only or write-only
                (How : use getter method as private and remove the setter method so that you can not modify the string so that it will be read only .
                       use setter method as private so that it will be write only
                        1.  set the 'str' as private static in MyPrivateClass
                        2.  
                        )
            -   Promots Reusability

    */