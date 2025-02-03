# Recursão

Recursão é uma técnica de programação em que uma função (ou método) chama a si mesmo.

Exemplos onde utilizamos a recursão: número triangulares. Números ao qual formam triangulos equiláteros

Sequencia de fibonacci, números fatoriais etc.

```java
int fatorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return (n * fatorial(n - 1))
    }
}
```

## Anagramas

Podemos aplicar recursão em anagramas

