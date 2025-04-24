package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Jdbc;

public class IplApp
{
    private Jdbc jdbc;
    // initialize by literal, constructor, method
    // not by reference because it is private

    public IplApp(Jdbc jdbc)
    {
        this.jdbc=jdbc;
    }

    public void saveTeamInfo()
    {
        System.out.println("saveTeamInfo in IplApp");
        if(jdbc!=null)
        {
            jdbc.save();
        }
        else {
            System.out.println("jdbc is null");
        }
    }
}
