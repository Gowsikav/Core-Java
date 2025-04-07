package com.xworkz.modifier.external;

import com.xworkz.modifier.internal.Shell;

public class Tourist
{
    public Tourist() {
        System.out.println("Tourist constructor");
    }

    public void admire() {
        System.out.println("running in admire method");
        Shell shell = new Shell();
        shell.crack();
    }
}
