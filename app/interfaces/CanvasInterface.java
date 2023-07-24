package interfaces;

import models.Section;

import java.util.List;

public interface CanvasInterface {

    List<Section> list();
    Section create(String title, String content);
    Section get(Long id);
    Section update(Long id, String title, String content);
    Boolean delete(Long id);
}
