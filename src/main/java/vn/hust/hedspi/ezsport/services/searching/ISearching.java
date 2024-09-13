package vn.hust.hedspi.ezsport.services.searching;

import org.locationtech.jts.geom.Point;
import vn.hust.hedspi.ezsport.database.entities.Field;
import vn.hust.hedspi.ezsport.domain.dtos.user.UserSearchingResponseProjection;

import java.util.List;

public interface ISearching {
    List<Object> search(String keyword, Point point, double radius);
}
