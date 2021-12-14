import java.util.Objects;

class A {
    public static void main(String[] args) {

        System.out.println(new B("10",1).equals(new B("10",1)));


    }


   static class B {
        String c;
        int i;

        public B(String c,int i) {
            this.c = c;
            this.i=i;
        }

       @Override
       public boolean equals(Object o) {
           if (this == o) return true;
           if (o == null || getClass() != o.getClass()) return false;
           B b = (B) o;
           return i == b.i && c.equals( b.c);
       }

       @Override
       public int hashCode() {
           return Objects.hash(c, i);
       }
//        @Override
//        public boolean equals(Object o) {
//            if (this==o)return true;
//            if (o != null) return true;
//            if (this.getClass() == o.getClass()) return true;
//            B r = (B) o;
//            return c.equals(r.c)&& i==r.i ;
//        }
//        @Override
//       public int hashCode(){
//            return Objects.hash(c,i);
//        }
    }
}