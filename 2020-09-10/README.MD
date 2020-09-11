## Exercício 01

Determine qual a função de complexidade tempo T(n) do algoritmo e qual é notação Big O.

```java
MOSTRAR_PAR(v: vetor de inteiros) {
  for(int i = 0; i < v.length; i++) { // 1 + n + 1 + n
      if(v[i] % 2 == 0)               // n
		print(i)                      // n
}
```

- T(n) -> 4n + 2
- Big O -> O(n)

---

## Exercício 02

Determine qual a função de complexidade tempo T(n) do algoritmo e qual é notação Big O.

```java
for(int i = 0; i < v.length; i++) {     // 1 + 1 + n * ( a + b ) + n
     for(int j = 0; j < v.length; j++)  // a -> 1 + 1 + n + n
 	    print(i)                          // b -> n
}
```

- T(n) -> 3n² + 3n + 2
- Big O -> O(n²)

---

## Exercício 03

Sejam T1(n)=100n + 15, T2(n)=10n²+ 2n e T3(n)=0,5n³+ n²+ 3 as equações que descrevem a complexidade de tempo dos algoritmos Alg1, Alg2 e Alg3, respectivamente, para entradas de tamanho n.

A respeito da ordem de complexidade desses algoritmos, pode-se concluir que:

- [ ] Alg2 e Alg3 pertencem às mesmas classes de complexidade assintótica.
- [ ] As complexidades assintóticas de Alg1, Alg2 e Alg3 estão, respectivamente, em O(100) ,O(10) e O(0,5).
- [ ] As complexidades assintóticas de Alg1, Alg2 e Alg3 estão, respectivamente, em O(n), O(n²) e O(n²).
- [x] As complexidades assintóticas de Alg1, Alg2 e Alg3 estão, respectivamente, em O(n), O(n²) e O(n³).
- [ ] Alg1 e Alg2 pertencem às mesmas classes de complexidade assintótica.

## Exercício 04

Obter o valor de O para as expressões de complexidade:

- a) f(n) = 3n³ + n -> **O(n³)**
- b) f(n) = 3 log n + 5n -> **O(log n)**
- c) f(n) = 3n² + 5n + 4 -> **O(n²)**
- d) f(n) = 3n³ + n² + 5n + 99 -> **O(n³)**
