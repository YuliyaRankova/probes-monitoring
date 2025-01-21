package telran.probes.service;

public interface RangeProviderClient {

	double MIN_DEFAULT_VALUE = -100;
	double MAX_DEFAULT_VALUE = 100;
	Range getRange(long sensorId);
}
