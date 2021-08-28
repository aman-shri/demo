import java.util.*;
import java.io.*;
import java.lang.*;


public class CHECHOC {

    public static void main(String[] args) throws Exception {
        FastReader fs = new FastReader();
//        StringBuilder sb=new StringBuilder();
        PrintWriter out = new PrintWriter(System.out);
        int test = fs.nextInt();
        while (test-- != 0) {
            int n = fs.nextInt(), m = fs.nextInt(), x =fs.nextInt(), y = fs.nextInt();
            long ans = 0;
            if(y>=2*x) {
            	ans = n*m*x;
            }
            else if(y<2*x) {
            	if(n*m%2==0)
            		ans = ((n*m)/2) *y;
            	else
            		ans = (long)Math.ceil((m*n))*x;
            }
            out.println(ans);
        }
        out.close();
    }
    
    
    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
