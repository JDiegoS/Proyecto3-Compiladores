;
CLAS  Main{
    a : Int <- 1 * 5;
    b : Bool <- false;
    c : String <- "Hola"; 

    main() : SELF_TYPE {
        {
            b<- b+c;
        }
    } ;


};