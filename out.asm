.data
    num1: .word 5
    num2: .word 3

.text

    .globl main

    main:
    lw $t0, num1
    lw $t1, num2

    add $t2, $t1, $t0

    

