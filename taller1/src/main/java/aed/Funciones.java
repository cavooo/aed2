package aed;

class Funciones {
    int cuadrado(int x) {
        return x * x;
    }

    double distancia(double x, double y) {
        double res = Math.sqrt(x*x + y*y);
        return res;
    }

    boolean esPar(int n) {
        boolean res = n % 2 == 0;
        return res;
    }

    boolean esBisiesto(int n) {
        boolean multiploDe4 = n % 4 == 0;
        boolean multiploDe100 = n % 100 == 0;
        boolean multiploDe400 = n % 400 == 0;
        boolean res = (multiploDe4 && !multiploDe100) || multiploDe400;
        return res;
    }

    int factorialIterativo(int n) {
        int res = 0;
        if (n == 0) {
            res = 1;
        } else {
            res = n * factorialIterativo(n - 1);
        }
        return res;
    }

    int factorialRecursivo(int n) {
        int res = 0;
        if (n == 0) {
            res = 1;
        } else {
            res = n * factorialIterativo(n - 1);
        }
        return res;
    }

    boolean esPrimo(int n) {
       if (n <= 1) {
        return false;
       }
       for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return false;
        }
       } 

    return true;
    }

    int sumatoria(int[] numeros) {
        int sumatoria = 0;
        for (int numero : numeros) {
            sumatoria += numero;
        }
        return sumatoria;
    }

    int busqueda(int[] numeros, int buscado) {
        for (int i = 0; i < numeros.length; i ++) {
            if (numeros[i] == buscado) {
            return i;
            }
        }
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                return true;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        for (int numero : numeros) {
            if (!esPar(numero)) {
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    boolean esSufijo(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(s1.length() - 1 - i) != s2.charAt(s2.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
