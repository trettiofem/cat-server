package org.extendj;

import java.util.ArrayList;
import java.lang.StringBuilder;

public class CallgraphRequest {
    public String entryPackage;
    public String entryMethod;
    public String[] classPath;
    public String[] files;

    String[] getCompilerArgs() {
        ArrayList<String> args = new ArrayList<String>();

        // Add files and classpath
        for (String file : files) {
            args.add(file);
        }

        if (classPath.length > 0) {
            args.add("-classpath");

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < classPath.length; i++) {
                sb.append(classPath[i]);

                if (i != classPath.length - 1)
                    sb.append(':');
            }
            args.add(sb.toString());
        }

        args.add("-nowarn");
        String[] a = args.toArray(new String[args.size()]);

        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i]);
        //     System.out.print(' ');
        // }
        
        return a;
    }
}
