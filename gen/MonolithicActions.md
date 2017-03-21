# Actions for the Monolithic Scope

## Purpose

Build a symbol table for a language with a single, flat scope.

**Disclaimer:** This pattern is not suitable for the final language but
it would help for future development.

## Discussion

The primary goal when building a symbol table is to construct a scope
tree. In this case, the scope tree is pretty boring since it’s a single node
(the global scope). The following table indicates how to build the single
scope by responding to input constructs. We technically don’t need to
push and pop scopes for this simple case, but we’ll do so for consistency
with the other patterns.


**Upon** **==>** Action(s)

1. Start of file **==>** push a GlobalScope. def BuiltInType objects for any built-in types such as int and float.
2. Declaration x **==>** ref x’s type (if any). def x in the current scope.
3. Reference x **==>** ref x starting in the current scope.
4. End of file **==>** pop the GlobalScope.



