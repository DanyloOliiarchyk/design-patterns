package com.oliiarchyk.designpatterns.command;

public class DownloadFileCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Executing command - 'Download File'");
    }

    @Override
    public void revert() {
        System.out.println("Reverting command - 'Download File'");
    }
}
