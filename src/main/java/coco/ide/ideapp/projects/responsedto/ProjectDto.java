package coco.ide.ideapp.projects.responsedto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProjectDto {
    private final Long projectId;
    private String name;
    private final String language;
}
