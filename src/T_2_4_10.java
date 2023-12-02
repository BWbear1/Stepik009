import java.sql.SQLOutput;

public class T_2_4_10 {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            String rolesName = roles[i];
            result.append(rolesName + ":" + "\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(rolesName + ":")) {
                    result.append((j + 1)).append(")").append(textLines[j].replaceFirst(rolesName + ":", "")).append("\n");
                }

            }
            result.append("\n");
        }
        System.out.println(result.toString());
    }
}



//    private String printTextPerRole(String[] roles, String[] textLines) {
//        StringBuilder result = new StringBuilder();
//        for (
//                int i = 0;
//                i < roles.length; i++) {
//            String rolesName = roles[i];
//            result.append(rolesName + ":" + "\n");
//            for (int j = 0; j < textLines.length; j++) {
//                if (textLines[j].startsWith(rolesName + ":")) {
//                    result.append((j + 1)).append(")").append(textLines[j].replaceFirst(rolesName + ":", "")).append("\n");
//                }
//            }
//            result.append("\n");
//        }
//        return result.toString();
//    }


/////////////////////////
//        String str = "Привет, мир!";
//boolean startsWithG = "Google".startsWith("G");
//boolean startsWithZ = "Zuckerberg".startsWith("Zu");
//        sb.append("Иван");
//        sb.append(" \nИванов");
//        String h = sb.toString();
//        System.out.println(h);
//        System.out.println(str.substring(1));
//        System.out.println(str.substring(1, 5)); //


//    }
//}
