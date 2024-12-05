package org.extendj;

import java.util.ArrayList;

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

        for (String path : classPath) {
            args.add("-classpath");
            args.add(path);
        }

        args.add("-nowarn");
        return args.toArray(new String[args.size()]);
    }
}
