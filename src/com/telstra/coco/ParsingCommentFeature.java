package com.telstra.coco;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingCommentFeature {
    private String line;
    private static String id_regx = "^\\s*@(\\S+)";
    private static String comment_regx ="\\s*#comment\\s+([^#]+)";

    private static String testing_regx ="\\s*#comment\\s+([^#]+)";

    public ParsingCommentFeature(String line)
    {
        this.line = line;
    }


    public ArrayList<String> parsing()
    {
        String regx = id_regx + comment_regx;
        ArrayList<String> content = new ArrayList<String>() ;

        //pre-processing trim
        String line = preProcessing(this.line);

        // Create Pattern object
        Pattern pattern = Pattern.compile(regx);

        // create matcher object.
        Matcher m = pattern.matcher(line);

        if (m.find( )) {
            int groupCount = m.groupCount();
            for (int i = 1; i <= groupCount; i++) {
                // Group i substring
                content.add(m.group(i));
            }
        }else {
            System.out.println("NO MATCH");
        }

        return content;
    }
    public String preProcessing(String before) {
        String after = before.trim().replaceAll("\\s+", " ");
        System.out.println(after);
        return after;
    }
}

