package kr.or.teamserver.coinserver.service;

import kr.or.teamserver.coinserver.model.Device;

import java.util.Optional;

public interface DeviceService {
    void create(String token, String date);

    Optional<Device> read(Long id);

    void update(Long id, String token, String date);

    void delete(Long id);

    //<Optional<Device>> readAll();
}
