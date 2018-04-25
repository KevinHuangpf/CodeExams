import java.util.*;


//虎牙直播是中国领先的弹幕式互动直播平台,累计注册用户2亿,提供在线直播观看、赛事直播与游戏直播,热门手游直播等。包含王者荣耀,绝地求生,荒野行动等游戏
public class Main22 {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("中国");
        hashSet.add("直播");
        hashSet.add("游戏");
        hashSet.add("游戏直播");
        hashSet.add("综艺娱乐");
        hashSet.add("互动直播平台");
        Scanner scanner = new Scanner(System.in);
        String strings = scanner.nextLine();

        HashSet listOut = matchWords(strings,hashSet);
        int size = listOut.size()-1;
        Iterator<String> it = listOut.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.print(str);

            if(size>0) System.out.print(",");
            size--;
        }


    }


    public static HashSet<String> matchWords(String str, HashSet hs){
        HashSet<String> strings = new HashSet<>();
        while(str.length()>0){
            int wordsL=6;
            if(str.length()<wordsL){
                wordsL=str.length();
            }


            String words = str.substring(0, 0+wordsL);

            while(!hs.contains(words)){
                if(words.length()==1){
                    break;
                }
                words=words.substring(0, words.length()-1);
            }
            if(words.length()>=2) {
                strings.add(words);
            }
            str=str.substring(words.length());
        }
        return strings;
    }
}


/*
    Set<String> set = new HashSet<String>();
    Iterator<String> it = set.iterator();
while (it.hasNext()) {
        String str = it.next();
        System.out.println(str);
        }

        2、for循环遍历：
        for (String str : set) {
        System.out.println(str);
        }  */
