public class Main {
        {
            String s = "Hola";
            int x = s.length();
        }

        {
            {
                {
                    String s1 = "Hola";
                    boolean b1 = s1.isEmpty();


                    String s2 = "";
                    boolean b2 = s2.isEmpty();
                }
            }

            {
                String t = "Hola";
                for (int i = 0; i < t.length(); i++) {
                    char c = t.charAt(i);
                    System.out.println(c);
                }
            }

            {
                String x = "Hola";
                String y = "Hola";
                {
                    if (x.equals(y)) {
                        System.out.println("SI pasa por aquí!");
                    }
                }
            }
            {
                String s = "Hola, como estas";
                int p1 = s.indexOf('a');
                int p2 = s.lastIndexOf('a');
            }
            {
                String s = "Hola, como estas? Estas como querias?";
                int p1 = s.indexOf("como");
                int p2 = s.indexOf("estas");
                int p3 = s.lastIndexOf("como");
            }

            {
                String s = "Hola, como estas?";
                String may = s.toUpperCase();
                String min = s.toLowerCase();
            }
            {

                String s = "hola, como estas?";
                String s1 = s.substring(0, 4);
                String s2 = s.substring(6, 10);
                String s3 = s.substring(11);

            }
            {
                {
                    String s1 = "12234";
                    int i = Integer.parseInt(s1);
                    String t1 = Integer.toString(i);
                }
                {
                    String s2 = "1234.56";
                    double d = Double.parseDouble(s2);
                    String t2 = Double.toString(d);
                }
            }
            {
                {
                    String s = "hola, ";
                    String t = "que tal?";
                    String u = s + t;
                }

            }
            {
                String s = "Hola";
                s = "chau";
                System.out.println(s);
            }
            {
                {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Hola, ");
                    sb.append("Chau");
                    System.out.println(sb);
                }
            }
            {
                {
                    StringBuilder sb = new StringBuilder("Hola");
                    sb.setCharAt(2, 'X');
                    System.out.println(sb);
                }
            }
        }
    }

