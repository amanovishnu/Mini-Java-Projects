# Quadartic-Roots

The goal is to create a JSF .xhtml facelet and an associated javabean for solving a quadratic equation. Some hints to programming are provided below.

1)      A quadratic equation is of the form ax2   +  bx + c = 0. Its roots are given by the formulas:
                                                root1  = ( - b + √(b2 – 4 * a * c) ) / ( 2 * a)and
                                           root2  = ( - b - √(b2 – 4 * a * c) ) / ( 2 * a)
These roots may be real and different, real and equal, or complex, depending upon the value of the discriminant, b2 – 4 * a * c.
Program requirements:

A) Create text boxes (with appropriate labels) in a panelGrid to enable the entry of the coefficients a, b and c.                                                                                                                                                                                      

B) Create (using a panelGrid), a commandButton and an outputText area in which the nature of the two roots is described (real/equal/complex), and the values of the roots (or the real and imaginary parts of a complex root) are also printed, in an appealing format.                                                                                       

C) Create an associated javabean to set the values of a, b and c, and of the two roots, or the real and imaginary parts of a complex root.
