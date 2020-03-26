

    public class Punto1 {
        public String calcular(String operacion) {
            String[] cola = operacion.split(" ");
            if(cola.length==1||cola.length==2)
               return operacion;
            else {
                String[] cola2 = new String[cola.length - 2];
                String operacion2 = "" + operar(cola[0], cola[1], cola[2]);
                cola2[0] = operacion2;
                int j = 3;
                for (int i = 1; i < cola2.length; i++) {
                    cola2[i] = cola[j];
                    j++;
                }
                cola = cola2;

                String nuevo = "";
                for (int i = 0; i < cola.length; i++) {
                    if (i == cola.length - 1)
                        nuevo += cola[i];
                    else {
                        nuevo += cola[i] + " ";
                    }
                }
                return calcular(nuevo);
            }
        }
        private int operar(String a, String b, String operador)
        {
            int const1 = Integer.parseInt(a);
            int const2 = Integer.parseInt(b);
            int total=0;
            if(operador.equals("+"))
            {
                total= const1+const2;
            }
            if(operador.equals("-"))
            {
                total= const1-const2;
            }
            if(operador.equals("/"))
            {
                total= const1/const2;
            }
            if(operador.equals("*"))
            {
                total= const1*const2;
            }
            return total;
        }
    }

