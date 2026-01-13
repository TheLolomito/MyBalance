import { NativeStackScreenProps } from '@react-navigation/native-stack';
import { StyleSheet, Text, View } from 'react-native';

import { RootStackParamList } from '../App';

type Props = NativeStackScreenProps<RootStackParamList, 'Home'>;

export default function HomeScreen({ route }: Props) {
  const userEmail = route.params?.userEmail ?? 'tu cuenta';

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Hola, {userEmail}</Text>
      <Text style={styles.subtitle}>Tu balance está listo para revisar.</Text>
      <View style={styles.summaryCard}>
        <Text style={styles.summaryTitle}>Resumen del día</Text>
        <Text style={styles.summaryValue}>$ 1,240.00</Text>
        <Text style={styles.summaryNote}>Última actualización hace 5 min</Text>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#FFFFFF',
    padding: 24,
  },
  title: {
    fontSize: 24,
    fontWeight: '700',
    marginBottom: 8,
  },
  subtitle: {
    fontSize: 16,
    color: '#666666',
    marginBottom: 24,
  },
  summaryCard: {
    backgroundColor: '#F1F6FF',
    borderRadius: 16,
    padding: 20,
  },
  summaryTitle: {
    fontSize: 16,
    fontWeight: '600',
    marginBottom: 12,
  },
  summaryValue: {
    fontSize: 28,
    fontWeight: '700',
    color: '#2E6EF7',
    marginBottom: 6,
  },
  summaryNote: {
    fontSize: 14,
    color: '#666666',
  },
});
