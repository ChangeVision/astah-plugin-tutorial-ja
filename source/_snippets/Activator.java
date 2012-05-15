package com.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.example.internal.ClassDiagramDropExtension;
import com.example.internal.util.AstahAPIUtils;
import com.change_vision.jude.api.inf.view.IDiagramViewManager;

public class Activator implements BundleActivator {

  private AstahAPIUtils utils = new AstahAPIUtils();

  public void start(BundleContext context) {
    ClassDiagramDropExtension diagramDropTargetListener = new ClassDiagramDropExtension();
    IDiagramViewManager diagramViewManager = utils.getDiagramViewManager();
    diagramViewManager.addDropTargetListener(diagramDropTargetListener);
  }

  public void stop(BundleContext context) {
  }
}
