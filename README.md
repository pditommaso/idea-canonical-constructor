# IDEA CANONICAL CONSTRUCTOR ISSUE 

This repo replicates IntelliJ IDEA issue when using Groovy 2.5.x 
canonical constructor. 

Creating an instance of a class annotated with `@Canonical` annotation taking one argument
is reported an error "Cannot apply default constructor for class Xxx" 

IntelliJ IDEA version 2018.1.6
Groovy version 2.5.1

