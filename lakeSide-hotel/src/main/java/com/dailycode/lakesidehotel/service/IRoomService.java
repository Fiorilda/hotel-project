package com.dailycode.lakesidehotel.service;

import com.dailycode.lakesidehotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

public interface IRoomService {

    public Room addNewRoom (MultipartFile photo, String roomType, BigDecimal roomPrice) throws SQLException, IOException;
}
