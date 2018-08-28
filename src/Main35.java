import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;




public class Main35 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        HashMap<Long,Long> hashMap = new HashMap<>();
        long[] di = new long[m+n];

        for(int i=0;i<n;i++){
            di[i] = sc.nextLong();
            long pi = sc.nextLong();
            hashMap.put(di[i],pi);
        }

        long[] cap = new long[m];
        for(int i=0;i<n;i++){
            cap[i]=sc.nextLong();
        }

        maxReward(n,m,di,hashMap,cap);
        for(int i=0;i<m;i++){
            System.out.println(hashMap.get(cap[i]));
        }


    }

    public static void maxReward(int n, int m, long[] di,HashMap<Long,Long> hashMap, long[] cap){

        for(int i=0;i<n;i++) {
            di[n + i] = cap[i];
            if (!hashMap.containsKey(cap[i])) {
                hashMap.put(cap[i], (long) 0);
            }
        }
        Arrays.sort(di);
        long max=0;
        for(int i =0; i< m+m;i++){
            max = Math.max(max,hashMap.get(di[i]));
            hashMap.put(di[i],max);
        }



    }
}


/*public class Main35 {
        public static void main(String args[]){
            Scanner sc =  new Scanner(System.in);
            int N= sc.nextInt();
            int M= sc.nextInt();


            int[][] jobs = new int[N][2];
            for(int i=0;i <N;i++){
                jobs[i][0]=sc.nextInt();
                jobs[i][1]=sc.nextInt();
            }

            int[] ability = new int[M];
            for (int i =0; i<M ;i++){
                ability[i] = sc.nextInt();
            }
            sc.close();
            int[] MaxReward = maxReward(jobs,ability);
            for(int i:MaxReward){
                System.out.println(i);
            }

        }

        public static int[] maxReward(int[][] jobs, int[] ability){
            int[] maxReward = new int[ability.length];
            for(int i=0;i<maxReward.length;i++){
                maxReward[i]=0;
            }

            for(int i=0;i<ability.length;i++){
                for(int j=0; j<jobs.length;j++) {
                    if(ability[i] >= jobs[j][0]) {
                        if (maxReward[i] < jobs[j][1]) {
                            maxReward[i] = jobs[j][1];
                        }
                    }
                }
            }

            return maxReward;

        }


    }*/


